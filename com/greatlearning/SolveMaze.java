package com.greatlearning;

public class SolveMaze {
    private static class MazeSolver {
        int[][] maze = {
            {0, 1, 1, 1, 1, 1 },
            {0, 0, 0, 1, 1, 1},
            {1, 0, 1, 1, 0, 1},
            {1, 0, 0, 1, 0, 1},
            {1, 1, 0, 1, 0, 1},
            {0, 0, 0, 0, 0, 1},
            {1, 1, 0, 1, 1, 1},
            {1, 1, 0, 0, 0, 1},
            {1, 0, 0, 1, 0, 1},
            {1, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 1, 1},
            {1, 1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1, 1}
        };

        int[][] visited = {
            {0, 1, 1, 1, 1, 1 },
            {0, 0, 0, 1, 1, 1},
            {1, 0, 1, 1, 0, 1},
            {1, 0, 0, 1, 0, 1},
            {1, 1, 0, 1, 0, 1},
            {0, 0, 0, 0, 0, 1},
            {1, 1, 0, 1, 1, 1},
            {1, 1, 0, 0, 0, 1},
            {1, 0, 0, 1, 0, 1},
            {1, 0, 1, 1, 1, 1},
            {1, 0, 0, 0, 1, 1},
            {1, 1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1, 1}
        };

        ArrayStack<Location> path = new ArrayStack<Location>();

        Location start = new Location( 0, 0 ), end = new Location( 11, 5 );

        private void printVisited() {
            for( int i = 0; i < 13; i++ ) {
                for( int j = 0; j < 6; j++ ) {
                    System.out.print( visited[i][j] + " " );
                }
                System.out.println();
            }
        }

        private Location getUnvisitedNeighbour( Location cur ) {
            int i = cur.getX(), j = cur.getY();
    
            // top
            if( i > 0 && maze[i - 1][j] == 0 && visited[i - 1][j] != 2 ) {
                return new Location( i - 1, j );
            } 
    
            // right
            if( j < 5 && maze[i][j + 1] == 0 && visited[i][j + 1] != 2 ) {
                return new Location( i, j + 1 );
            } 
    
            // bottom
            if( i < 12 && maze[i + 1][j] == 0 && visited[i + 1][j] != 2 ) {
                return new Location( i + 1, j );
            } 

            // left
            if( j > 0 && maze[i][j - 1] == 0 && visited[i][j - 1] != 2 ) {
                return new Location( i, j - 1 );
            }

            return null;
        }

        public void solve() {
            Location cur = start, stackTop;

            // mark current as visited
            visited[cur.getX()][cur.getY()] = 2;

            // continue walking as long as we don't reach the end
            while( cur.getX() != end.getX() && cur.getY() != end.getY() ) {
                // System.out.println( cur );
                int i = cur.getX(), j = cur.getY();

                Location next = getUnvisitedNeighbour( cur );
                visited[i][j] = 2; // mark current location as visited
                // printVisited();

                if( i == 10 && j == 3 ) {
                    printVisited();
                    System.out.println( path );
                }

                if( next != null ) {
                    // System.out.println( "moving to next..." );
                    path.push( cur );
                    cur = next; // move to next location
                } else {
                    // System.out.println( "backtracking..." );
                    do {
                        stackTop = path.peek();
                        if( getUnvisitedNeighbour( stackTop ) == null ) {
                            // System.out.println( "popped " + cur );
                            path.pop();
                        } else {
                            // System.out.println( "found some place to go" );
                            cur = path.peek();
                            break;
                        }
                    } while( true );
                }
            }

            System.out.println( path );
            System.out.println( cur );
        }
    }

    public static void main(String[] args) {
        MazeSolver mazeSolver = new MazeSolver();

        mazeSolver.solve();
    }
}