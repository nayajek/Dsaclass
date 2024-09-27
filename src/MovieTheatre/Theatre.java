package MovieTheatre;
import java.util.Scanner;
public class Theatre {
    private final char[][] seats;

        //Initialize seating chart (20 rows, 20 seats per row)

        public Theatre(int rows, int seatsPerRow) {

            seats = new char[rows][seatsPerRow];

            //Set all seats to 'A' for Available

            for (int i = 0; i < rows; i++) {

                for (int j = 0; j < seatsPerRow; j++) {

                    seats[i][j] = 'A';  // 'A' for Available Seats

                }

            }

        }

        //To reserve a seat

        public void reserveSeat(int row, int seat) {

            if (row >= 0 && row < seats.length && seat >= 0 && seat < seats[row].length) {

                if (seats[row][seat] == 'A') {

                    seats[row][seat] = 'R';  //'R' for Reserved Seats

                    System.out.println("Seat Reserved Successfully!");

                } else {

                    System.out.println("Seat is already Reserved!");

                }

            } else {

                System.out.println("Invalid Seat Number!");

            }

        }

        //To cancel a reservation

        public void cancelSeat(int row, int seat) {

            if (row >= 0 && row < seats.length && seat >= 0 && seat < seats[row].length) {

                if (seats[row][seat] == 'R') {

                    seats[row][seat] = 'A';  // Back to 'A' for Available Seats

                    System.out.println("Seat Reservation Canceled!");

                } else {

                    System.out.println("Seat is Not Reserved!");

                }

            } else {

                System.out.println("Invalid Seat Number!");

            }

        }

        //To print the seating chart

        public void printSeatingChart() {

            System.out.println("Seating Chart:");

            for (char[] seat : seats) {

                for (char c : seat) {

                    System.out.print(c + " ");

                }

                System.out.println();

            }

        }

        //To test the program

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            Theatre theatre = new Theatre(20, 20); //20 rows, 20 seats per row

            while (true) {

                System.out.println("\n1. Reserve a seat");

                System.out.println("2. Cancel a reservation");

                System.out.println("3. Retrieve initial seating chart");

                System.out.println("4. Exit");

                System.out.print("Choose an option: ");

                int option = scanner.nextInt();

                switch (option) {

                    case 1:  //Reserve a seat

                        System.out.print("Enter row number (0-20): ");

                        int row = scanner.nextInt();

                        System.out.print("Enter seat number (0-20): ");

                        int seat = scanner.nextInt();

                        theatre.reserveSeat(row, seat);

                        break;

                    case 2:  //Cancel a reservation

                        System.out.print("Enter row number (0-20): ");

                        row = scanner.nextInt();

                        System.out.print("Enter seat number (0-20): ");

                        seat = scanner.nextInt();

                        theatre.cancelSeat(row, seat);

                        break;

                    case 3:  //View seating chart

                        theatre.printSeatingChart();

                        break;

                    case 4:  //Exit program

                        System.out.println("Exiting...");

                        return;

                    default:

                        System.out.println("Invalid option. Please try again.");

                }

            }

        }
}
