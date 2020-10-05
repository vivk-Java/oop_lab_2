package utm.isa.Box;

public class Box {
    public float width;
    public float height;
    public float depth;

    public Box() {
        this.width = 1;
        this.height = 1;
        this.depth = 1;
    }

    public Box(float length) {
        this.width = length;
        this.height = length;
        this.depth = length;
    }

    public Box(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public float surfaceCalc() {
        return 2 * (this.width * this.height + this.width * this.depth + this.depth * this.height);
    }

    public float volumeCalc() {
        return this.height * this.height * this.depth;
    }

    public String toString() {
        return getClass().getName() + "[width=" + this.width +
                ",height=" + this.height +
                ",depth=" + this.depth + "]";
    }
}
