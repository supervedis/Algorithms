/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.algos;

/**
 *
 * @author soup
 */
public class Qsort {

    public static void main(String args[]) {
        int ar[] = {13,19,9,5,12,8,7,4,11,2,6,21};
        hoareSort(ar, 0, ar.length - 1);
       //int ar[]={8, 1, 3, 2, 5, 7, 6, 4};

        for (int i = 0; i < ar.length; i++) {
            System.out.print(" " + ar[i]);
        }
        System.out.println("");

        for (int i = 0; i < ar.length; i++) {
            System.out.print(" " + ar[i]);
        }
        System.out.println("");
        //System.out.println("Return= "+j);*/
    }

    static void hoareSort(int ar[], int lo, int hi) {
        if (lo < hi) {
            int p = hoarePartition(ar, lo, hi);
            hoareSort(ar, lo, p);
            hoareSort(ar, p + 1, hi);
        }
    }

    static int lomutoPartition(int ar[], int lo, int hi) {
        int p = ar[lo];
        int i = lo - 1;
        int j = hi + 1;
        while (true) {
            do {
                i = i + 1;
            } while (ar[i] < p);

            do {
                j = j - 1;
            } while (ar[j] > p);

            if (i >= j) {
                return j;
            }

            swap(ar, i, j);
        }
    }

    static int hoarePartition(int ar[], int l, int h) {
        int p = ar[l];
        int i = l - 1;
        int j = h + 1;
        while (true) {
            do {
                j = j - 1;
            } while (ar[j] > p);

            do {
                i = i + 1;
            } while (ar[i] < p);

            if (i < j) {
                swap(ar, i, j);
            } else {
                return j;
            }
        }
    }

    static void swap(int ar[], int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
