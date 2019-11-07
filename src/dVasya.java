public class dVasya {

    public static void main(String[] args) {
	// write your code here
        int temperatur = 28;
        int dayOfWeek = 4;
        int badDays = (7 - dayOfWeek) +4;

        if (temperatur >=19 && temperatur <=23 && dayOfWeek == 4){
            System.out.println("Сегодня четверг и погода отличная! Дядя Вася идёт рыбачить!");
        }else if (temperatur <19){
            System.out.println("Сегодня холодно, не пойдет дядя Вася рыбачить");
        }else if (temperatur >23){
            System.out.println("Сегодня слишком жарко, дядя Вася не пойдет рыбачить");
        }else if (temperatur >=19 && temperatur <=23 && dayOfWeek != 4){
            System.out.println("сегодня не четверг, до следующей рыбалки " + badDays + " дней");
        }
        }
    }

