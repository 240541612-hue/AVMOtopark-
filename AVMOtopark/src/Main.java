class AVMOtopark {

    public static void main(String[] args) {

        int[][] otopark = {
                {1,0,0,1,1,0,0,0,0,0},
                {0,1,1,0,0,0,1,0,0,1},
                {1,1,1,0,0,1,1,0,0,0},
                {0,0,0,0,1,0,0,1,1,0},
                {1,0,1,0,0,1,0,1,0,1}
        };

        for (int i = 0; i < otopark.length; i++) {
            int sayac = 0;

            for (int j = 0; j < otopark[i].length; j++) {
                if (otopark[i][j] == 1) {
                    sayac++;
                }
            }

            System.out.println("Kat " + (i+1) + ": " + sayac + " arac park etmis");
        }
    }
}
