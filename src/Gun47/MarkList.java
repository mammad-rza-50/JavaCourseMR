package Gun47;

        public class MarkList { //_08_OCA_Exam_52_Method
            int num;
            // image1, image2
            public static void graceMarks(MarkList obj4){
                obj4.num+=10;
            }

            public static void main(String[] args) {
                MarkList obj1=new MarkList();
                MarkList obj2=obj1;
                MarkList obj3=null;

                obj2.num=60;
                graceMarks(obj2);
            }


        }


