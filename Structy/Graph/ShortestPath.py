from collections import deque

def shortest_path(edges, node_A, node_B):
  graph = build_graph(edges)
  queue = deque([(node_A, 0)])
  maxShort = -1
  visited = set([node_A])
  while queue:
    node, distance = queue.popleft()
    if node == node_B:
      return distance
    for neig in graph[node]:
      if neig not in visited:
        visited.add(node)
        queue.append((neig, distance+1))
  return -1
      
def build_graph(edges):
  graph = {}
  for edge in edges:
    a, b = edge
    if a not in graph:
      graph[a] = []
    if b not in graph:
      graph[b] = []
    graph[a].append(b)
    graph[b].append(a)
  return graph
    
  