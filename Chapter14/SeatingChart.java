public class SeatingChart {
    private Student[][] seats;

    public SeatingChart(int rows, int cols) {
        seats = new Student[rows][cols];
    }

    public void assignSeat(int r, int c, Student s) {
        seats[r][c] = s;
    }

    public boolean hasEmptyRow(int row) {
        for (int c = 0; c < seats[row].length; c++) {
            if (seats[row][c] != null) {
                return false;
            }
        }
        return true;
    }

    public int findStudent(String name) {
        for (int r = 0; r < seats.length; r++) {
            for (int c = 0; c < seats[0].length; c++) {
                if (seats[r][c] != null &&
                    seats[r][c].getName().equals(name)) {
                    return c;
                }
            }
        }
        return -1;
    }

    public double getEmptySeatPercentage() {
        int emptySeats = 0;
        int totalSeats = seats.length * seats[0].length;

        for (int r = 0; r < seats.length; r++) {
            for (int c = 0; c < seats[0].length; c++) {
                if (seats[r][c] == null) {
                    emptySeats++;
                }
            }
        }

        return (double) emptySeats / totalSeats;
    }
}
