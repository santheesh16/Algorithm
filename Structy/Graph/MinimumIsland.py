def minimum_island(grid):
  visited = set()
  min_island = float("inf")
  for r in range(len(grid)):
    for c in range(len(grid[0])):
      size = explore_graph(grid, r, c, visited)
      if size > 0 and size < min_island:
        min_island = size
  return min_island

def explore_graph(grid, r, c, visited):
  row_bounds = 0 <= r < len(grid)
  col_bounds = 0 <= c < len(grid[0])
  if not row_bounds or not col_bounds:
    return 0

  if grid[r][c] == 'W':
    return 0
  pos = (r, c)
  if pos in visited:
    return 0
  visited.add(pos)
  curr_len = 1
  four_sides = [(1,0),(-1,0),(0,1),(0,-1)]
  for i,j in four_sides:
    curr_len += explore_graph(grid, r+i, c+j, visited)
  return curr_len