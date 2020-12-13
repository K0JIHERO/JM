import java.util.Objects;

public class JC348 {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(1,1);
// a.equals(b) must return true
// a.hashCode() must be equal to b.hashCode()
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());

    }
    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;

        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ComplexNumber that = (ComplexNumber) o;
            return Double.compare(that.re, re) == 0 &&
                    Double.compare(that.im, im) == 0;
        }



        //
//        @Override
//        public int hashCode() {
//            final double prime = 31;
//            double result = 17;
//            result = prime * result + re;
//            result = prime * result + im;
//            return (int) result;
//        }
    }
}
