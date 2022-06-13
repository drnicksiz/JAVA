package Biyoloji;
public class control {

    public static double bestScore(String sequence1,String sequence2,int L,double eslesme,double eslesmeme,double indel) {
        double[][] skor= new double[L+1][L+1];

        for(int i=0;i<=L;i++) {
            for(int j=0;j<=L;j++) {
                skor[0][j]=0.0;
                skor[i][0]=0.0;
            }
        }

        for(int i=1;i<=L;i++) {
            for(int j=1;j<=L;j++) {

                double sol=skor[i][j-1]-indel;
                double ust=skor[i-1][j]-indel;
                double temp=0.0;

                if(sequence1.charAt(j-1)==sequence2.charAt(i-1)) {
                    temp=eslesme;
                }
                else {
                    temp=(-eslesmeme);
                }

                double capraz=skor[i-1][j-1]+temp;


                skor[i][j]=Math.max((Math.max(ust,capraz)),sol);


            }
        }
        double best=0.0;
        for(int i=1;i<=L;i++) {
            for(int j=1;j<=L;j++) {

                if(skor[i][L]>best) {
                    best=skor[i][L];
                }
                if(skor[L][j]>best) {
                    best=skor[L][j];
                }

            }
        }
        for(int i=0;i<=L;i++) {
            for(int j=0;j<=L;j++) {
                System.out.print(skor[i][j]+" ");
            }
            System.out.println();
        }



        return best;
    }



    public static void main(String[] args) {
        System.out.println(bestScore("CCGAGCTC","TCAATTTT",8,3 ,2, 1));
        //         overlap(6,1,3,2,a,b);
    }


}