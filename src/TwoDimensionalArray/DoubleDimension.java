package TwoDimensionalArray;

public class DoubleDimension {
    int arr[][] = null;

    //constructor
    public DoubleDimension(int rows, int col) {
        arr = new int[rows][col];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    //Insert method
    public void insert(int row, int col, int valueToInsert) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = valueToInsert;
                System.out.println("Successfully inserted " + valueToInsert + " at [" + row + "][" + col + "]");
            } else {
                System.out.println("This cell is already occupied at [" + row + "][" + col + "]");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array.");
        }
    }

    //Traverse an array
    public void traverse() {
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println(); // New line after each row
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists.");
        }
    }

    //Search for an element
    public void searchArray(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == valueToSearch) {
                    System.out.println("Value " + valueToSearch + " is found at [" + i + "][" + j + "]");
                    return;
                }
            }
        }
        System.out.println("Value " + valueToSearch + " is not found.");
    }

    //Delete value from the array
    public void deleteValueAt(int row, int col) {
        try {
            arr[row][col] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully at [" + row + "][" + col + "]");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Value provided is invalid and not in the range of array.");
        }
    }

    //Delete entire array
    public void deleteArray() {
        arr = null;
        System.out.println("The array has been successfully deleted.");
    }

    public static void main(String[] args) {
        //Create a 2x2 array
        DoubleDimension doubleDimension = new DoubleDimension(2, 2);

        //Insert values into the array
        doubleDimension.insert(0, 0, 25);
        doubleDimension.insert(0, 1, 45);
        doubleDimension.insert(1, 0, 75);
        doubleDimension.insert(1, 1, 95);

        //Traverse the array
        System.out.println("Array after insertion:");
        doubleDimension.traverse();

        //Search for value in the array
        System.out.println("\nSearch for value 45:");
        doubleDimension.searchArray(45);

        //Delete a value from the array
        System.out.println("\nDelete value at [1][1]:");
        doubleDimension.deleteValueAt(1, 1);
        doubleDimension.traverse();

        //Delete the entire array
        System.out.println("\nDelete the entire array:");
        doubleDimension.deleteArray();
        doubleDimension.traverse();
    }
}
