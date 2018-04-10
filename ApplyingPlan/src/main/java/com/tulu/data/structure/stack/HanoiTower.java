package com.tulu.data.structure.stack;

public class HanoiTower {

    public static class Tower{
        int index;
        Stack<Integer> stack;

        public Tower(int index){
            this.index = index;
            this.stack = new Stack<Integer>();
        }

        public void push(int val){
            this.stack.push(val);
        }

        public int getDisplayIndex(){
            return index + 1;
        }

        public void moveTopTo(Tower destination){
            Integer val = stack.pop();
            System.out.println("Move [" + val + "] from " + getDisplayIndex() + " to " + destination.getDisplayIndex());
            destination.push(val);
        }

        public void move(int n, Tower destination, Tower buffer){
            if (n>0) {
                move(n - 1, buffer, destination);
                moveTopTo(destination);
                buffer.move(n - 1, destination, this);
            }
        }

        public void printValue(){
            System.out.println("============");
            System.out.println("Value of Tower[" + getDisplayIndex() + "]");
            while (stack.peak() != null) {
                System.out.println(stack.pop());
            }
        }
    }

    public static int hanoiTowerImplementation(int rods){
        int moves = 0;
        Tower[] towers = new Tower[3];

        for (int i=0;i<3;i++)
            towers[i] = new Tower(i);
        for (int i=0;i<rods;i++)
            towers[0].push(rods-i);

        towers[0].move(rods, towers[2], towers[1]);

        for (int i=0;i<3;i++)
            towers[i].printValue();

        return moves;
    }
}