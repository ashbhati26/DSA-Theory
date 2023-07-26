import java.util.*;

public class Chocola {
    public static void main(String[] args) {
        int n = 4; 
        int m = 6;
        Integer costVertical[] = {2, 1, 3, 1, 4}; //n-1
        Integer costHorizontal[] = {4, 1, 2}; //m-1

        Arrays.sort(costVertical, Collections.reverseOrder());
        Arrays.sort(costHorizontal, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1; // p = peaces
        int cost = 0;

        while(h < costHorizontal.length && v < costVertical.length){
            if(costVertical[v] <= costHorizontal[h]){// horizontal cut
                cost += (costHorizontal[h] * vp);
                hp++;
                h++;
            } else{ // vertical cut
                cost += (costVertical[v] * hp);
                vp++;
                v++;
            }
        }
        while(h < costHorizontal.length){
            cost += (costHorizontal[h] * vp);
            hp++;
            h++;
        }
        while(v < costVertical.length){
            cost += (costVertical[v] * hp);
            vp++;
            v++;
        }
        System.out.println("min cost of cuts = " + cost);
    } 
}
