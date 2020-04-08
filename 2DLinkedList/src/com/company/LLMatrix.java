package com.company;

public class LLMatrix {
    private Node start;

    // here x(first bracket) is the row, y(second bracket) is the column
    // so: arr[0][1] will be to the right of arr[0][0], and arr[1][0] will be below arr[0][0]
    public LLMatrix(int[][] arr) {
        validityCheck(arr);
        Node[][] nodeArr = new Node[arr.length][arr[0].length];
        start = new Node(0);
        Node previous = start;
        boolean first = true;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(first){
                    Node node = new Node(arr[i][j]);
                    start.setRight(node);
                    start.setDown(node);
                    previous = node;
                    nodeArr[i][j] = node;
                    first = false;
                } else {
                    Node node = new Node(arr[i][j]);
                    if(previous != null){
                        previous.setRight(node);
                    }
                    previous = node;
                    nodeArr[i][j] = node;
                }
            }
            previous = null;
        }
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr[0].length; j++){
                nodeArr[i][j].setDown(nodeArr[i+1][j]);
            }
        }
    }

    public void printMatrix(){
        Node row = this.start.getRight();
        Node column = row;
        while(true){
            while(true){
                System.out.print(row.getValue() + " ");
                if(row.getRight() != null){
                    row = row.getRight();
                } else {
                    break;
                }
            }
            System.out.println();
            if(column.getDown() != null){
                column = column.getDown();
                row = column;
            } else {
                break;
            }
        }
    }

    public void printRowColumn(int row, int column){
        Node node = start.getRight();
        for(int i = 0; i < row; i++){
            if(node.getRight() != null){
                node = node.getRight();
            } else {
                System.out.println("That is an invalid row");
            }
        }
        for(int i = 0; i < column; i++){
            if(node.getDown() != null){
                node = node.getDown();
            } else {
                System.out.println("That is an invalid column");
            }
        }
        System.out.println(String.format("Value at row:%1$s, column:%2$s = %3$s", row, column, node.getValue()));
    }

    private static void validityCheck(int[][] arr){
        if(arr.length == 0){
            throw new IndexOutOfBoundsException("The matrix is empty");
        } else if(arr[0].length == 0){
            throw new IndexOutOfBoundsException("The matrix is empty");
        }
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i].length != arr[i+1].length){
                throw new IndexOutOfBoundsException("The matrix is not rectangular");
            }
        }
    }
}
