public class Probability {
    private double probability;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Probability that = (Probability) o;

        if (Double.compare(that.probability, probability) != 0) return false;

        return true;
    }

    public Probability(double probability) {
        if (probability >= 1 || probability <= 0) throw new IllegalArgumentException();
        this.probability = probability;
    }

    public Probability(double favourableOutcomes, double possibleOutcomes) {
        this(favourableOutcomes / possibleOutcomes);
    }

    public double getValue() {
        return this.probability;
    }

    public Probability getInverseProbability() {
        return new Probability(1.0 - this.probability);
    }

    public Probability and(Probability p2) {
        return new Probability(this.getValue() * p2.getValue());
    }

    public Probability or(Probability p2) {
        return new Probability((this.getValue() + p2.getValue()) - (this.and(p2).getValue()));
    }

    public Probability xOr(Probability p2){
        return new Probability((this.or(p2).getValue())-(this.and(p2).getValue()));
    }
}
