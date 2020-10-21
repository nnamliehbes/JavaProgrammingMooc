
public class ClockHand {

    private int value;
    private int limit;

    // erstelle eine Grenze für den Wertebereich
    public ClockHand(int limit) {
        this.limit = limit;
        // alle Zeitangaben starten bei 0
        this.value = 0;
    }

    public void advance() {
        // der Wert soll um 1 steigen
        this.value = this.value + 1;

        // wenn der Werte die spezifische Grenze überschreitet
        // dann wird dieser wieder auf 0 gesetzt
        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    public int value() {
        return this.value;
    }

    // für die Anzeige: Alle Zahlen unter 10 werden mit
    // führender Null angegeben
    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }

        return "" + this.value;
    }
}
