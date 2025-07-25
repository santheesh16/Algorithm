from collections import deque

def longest_path(graph):
  distances = {}
  for node in graph:
    if len(graph[node]) == 0:
      distances[node] = 0

  for node in graph:
    explore_path(graph, node, distances)
  
  return max(distances.values())


def explore_path(graph, node, distances):
  if node in distances:
    return distances[node]

  curr_max = 0
  for neig in graph[node]:
    attempt = explore_path(graph, neig, distances)
    if attempt >curr_max:
      curr_max = attempt
  distances[node] = 1 + curr_max
  return distances[node]
  
    
  