def connected_components_count(graph):
  visited = set()
  count = 0
  for node in graph:
    if explore_graph(graph, node, visited):
      count += 1
  return count

def explore_graph(graph, current, visited):
  if current in visited:
    return False

  visited.add(current)
  for neig in graph[current]:
    explore_graph(graph, neig, visited)
  return True