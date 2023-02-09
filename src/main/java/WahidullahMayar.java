public class WahidullahMayar {

            public static final int n = 4;

            public static final int m = 4;


            // To calculate possible moves we need to

            static int findingThePossibleMoves(int mj[][], int p, int q)

            {

                // All possible moves of a knight

                int X[] = { 2, 1, -1, -2, -2, -1, 1, 2 };

                int Y[] = { 1, 2, 2, 1, -1, -2, -2, -1 };


                int count = 0;


                // Checking to see if each possible move is valid or not

                for (int i = 0; i < 8; i++) {


                    // Position of knight after move

                    int x = p + X[i];

                    int y = q + Y[i];


                    // count valid moves

                    if (x >= 0 && y >= 0 && x < n && y < m

                            && mj[x][y] == 0)

                        count++;

                }


                // Return number of possible moves

                return count;

            }


            // Driver program to check findPossibleMoves()

            public static void main(String[] args)

            {

                int mj[][] = { { 1, 0, 1, 0 },

                        { 0, 1, 1, 1 },

                        { 1, 1, 0, 1 },

                        { 0, 1, 1, 1 } };


                int p = 2, q = 2;


                System.out.println(findingThePossibleMoves(mj, p, q));

            }
        }

