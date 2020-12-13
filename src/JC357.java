//public class JC357 {
//    public static void main(String[] args) {
//        String [] test = {"This is a simple text for analyzing...", "This is the second one"};
//        TooLongTextAnalyzer test1 = new TooLongTextAnalyzer();
//        test1.processText(test[0]);
//
//    }
//
//    public class SpamAnalyzer extends KeywordAnalyzer{
//
//
//        @Override
//        protected void getKeywords() {
//        }
//
//        @Override
//        protected void getLabel() {
//        }
//
//        @Override
//        void processText() {
//            super.processText();
//        }
//    }
//
//    public class NegativeTextAnalyzer extends KeywordAnalyzer{
//        String[] nego = {":(", "=(", ":|"};
//        String[] s;
//        public NegativeTextAnalyzer(String[] s) {
//            this.s = s;
//        }
//
//        @Override
//        protected void getKeywords() {
//
//        }
//
//        @Override
//        protected Label getLabel() {
//
//        }
//
//        @Override
//        Label processText() {
//            super.processText();
//            int indexNego = s[0].indexOf(nego[0]);
//
//            if (indexNego == -1) {
//                return Label.OK;
//            }
//            else {
//                return Label.NEGATIVE_TEXT;
//            }
//        }
//    }
//
//    public abstract class KeywordAnalyzer implements TextAnalyzer{
//
//
//        @Override
//        public Label processText(String text) {
//            return null;
//        }
//
//        protected abstract void getKeywords();
//
//        protected abstract void getLabel();
//
//        void processText(){
//            getKeywords();
//            getLabel();
//        }
//    }
//
//    public static class TooLongTextAnalyzer implements TextAnalyzer{
//        int a = 10;
//        int maxLength;
//
//        public TooLongTextAnalyzer(){
//
//        }
//
//        @Override
//        public Label processText(String text) {
//            if (text.length() >= a){
//                return Label.TOO_LONG;
//            }
//            return Label.TOO_LONG;
//        }
//    }
//
//    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
//        //Твой код здесь
//        return Label.OK;
//    }
//}
