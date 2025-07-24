from collections import deque

def closest_carrot(grid, starting_row, starting_col):
  visited = set([(starting_row,starting_col)])
  queue= deque([(starting_row, starting_col, 0)])
  while queue:
    r, c , distance = queue.popleft()
    if grid[r][c] == 'C':
      return distance

    deltas = [(1,0),(-1,0),(0,1),(0,-1)]
    for delta in deltas:
      delta_row, delta_col = delta
      neig_row, neig_col = r + delta_row, c + delta_col
      row_inbounds = 0 <= neig_row < len(grid)
      col_inbounds = 0 <= neig_col < len(grid[0])
      pos = (neig_row, neig_col)
      if row_inbounds and col_inbounds and pos not in visited and grid[neig_row][neig_col] != 'X':
        visited.add(pos)
        queue.append((neig_row, neig_col, distance+1))
  return -1