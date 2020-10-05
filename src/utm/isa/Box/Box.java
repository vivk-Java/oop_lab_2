package utm.isa.Box;

public class Box {
    public float width;
    public float height;
    public float depth;

    public float surface;
    public float volume;

    public Box() {
        this.width = 1;
        this.height = 1;
        this.depth = 1;

        surfaceCalc();
        volumeCalc();
    }

    public Box(float length) {
        this.width = length;
        this.height = length;
        this.depth = length;

        surfaceCalc();
        volumeCalc();
    }

    public Box(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;

        surfaceCalc();
        volumeCalc();
    }

    public float surfaceCalc() {
        this.surface = 2 * (this.width * this.height + this.width * this.depth + this.depth * this.height);
        return this.surface;
    }

    public float volumeCalc() {
        this.volume = this.height * this.height * this.depth;
        return this.volume;
    }

    public String toString() {
        return getClass().getName() + "[width=" + this.width +
                ",height=" + this.height +
                ",depth=" + this.depth +
                ",surface=" + this.surface +
                ",volume=" + this.volume + "]";
    }
}
