def island_count(grid):
  visited = set()
  count = 0
  for r in range(len(grid)):
    for c in range(len(grid[0])):
       if explore_graph(grid, r, c, visited):
         count += 1
  return count
      


def explore_graph(grid, row, col, visited):
  row_bounds = 0 <= row < len(grid)
  col_bounds = 0 <= col < len(grid[0])
  if not row_bounds or not col_bounds:
    return False

  if grid[row][col] == 'W':
    return False

  pos = (row,col)
  if pos in visited:
    return False
  visited.add(pos)
  four_sides =[(0,1),(1,0),(0,-1),(-1,0)]
  for i,j in four_sides:
    explore_graph(grid, row+i, col+j,visited)
  return True
  
  
        