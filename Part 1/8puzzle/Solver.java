/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

import edu.princeton.cs.algs4.MinPQ;

import java.util.ArrayList;

public class Solver {
    private final boolean solvable;
    private final int moves;
    private final Iterable<Board> solution;

    private class SearchNode implements Comparable<SearchNode> {
        private final Board board;
        private final int moves;
        private final SearchNode previous;
        private final int priority;

        public SearchNode(Board board, int moves, SearchNode previous) {
            this.board = board;
            this.moves = moves;
            this.previous = previous;
            this.priority = board.manhattan() + moves;
        }

        @Override
        public int compareTo(SearchNode other) {
            return Integer.compare(this.priority, other.priority);
        }
    }

    public Solver(Board initial) {
        if (initial == null) throw new IllegalArgumentException();

        MinPQ<SearchNode> pq = new MinPQ<>();
        pq.insert(new SearchNode(initial, 0, null));

        MinPQ<SearchNode> twinPQ = new MinPQ<>();
        twinPQ.insert(new SearchNode(initial.twin(), 0, null));

        SearchNode goalNode = null;

        while (true) {
            goalNode = processQueue(pq);
            if (goalNode != null || processQueue(twinPQ) != null) break;
        }

        if (goalNode == null) {
            solvable = false;
            moves = -1;
            solution = null;
        }
        else {
            solvable = true;
            moves = goalNode.moves;
            ArrayList<Board> path = new ArrayList<>();
            for (SearchNode node = goalNode; node != null; node = node.previous) {
                path.add(0, node.board);
            }
            solution = path;
        }
    }

    private SearchNode processQueue(MinPQ<SearchNode> pq) {
        if (pq.isEmpty()) return null;
        SearchNode node = pq.delMin();
        if (node.board.isGoal()) return node;

        for (Board neighbor : node.board.neighbors()) {
            if (node.previous == null || !neighbor.equals(node.previous.board)) {
                pq.insert(new SearchNode(neighbor, node.moves + 1, node));
            }
        }
        return null;
    }

    public boolean isSolvable() {
        return solvable;
    }

    public int moves() {
        return moves;
    }

    public Iterable<Board> solution() {
        return solution;
    }
}