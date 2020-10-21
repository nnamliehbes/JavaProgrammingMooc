public class Timer {
    private ClockHand seconds;
    private ClockHand hundreds;

    // CLockHand-Objekte instanziieren mit
    // Wertebereiche für Sekunden und Millisekunden
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hundreds = new ClockHand(100);
    }

    // Timer-Mechanismus
    public void advance() {
        this.hundreds.advance();

        // wenn Hundertstell wieder auf 0 sind
        // (siehe andere Klasse, dass sie zurückspringen, wenn sie ihren
        // Wertebereich verlassen), dann ...
        if (this.hundreds.value() == 0) {
            // ... Sekunde um 1 erhöhen
            this.seconds.advance();
        }
    }

    public String toString() {
        return seconds + ":" + hundreds;
    }


}
