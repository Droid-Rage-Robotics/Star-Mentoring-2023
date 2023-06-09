package ftc;

public class Motor {
    private final int portNumber;

    public Motor(int portNumber) {
        this.portNumber = portNumber;
    }

    public int getPortNumber() {
        return portNumber;
    }

    /**
     * Sets the power of the motor.
     * If the power is equal to 0.5, it will print
     * "Vroom".
     * If the power is equal to 0, it will print
     * "Stopped".
     * @param power
     */
    public void setPower(double power) {
        if (power == 0.5) System.out.println("Vroom");
        if (power == 0) System.out.println("Stopped");
    }
}
