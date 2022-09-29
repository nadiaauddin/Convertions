import java.util.Scanner;

class MetricConverter {
  public static float converter(float sourceNum, String sourceMetric, String targetMetric) {
    
    float targetNum = 0;
    switch (sourceMetric) {
        case "km":
            switch (targetMetric) {
                case "m":
                    targetNum = sourceNum * 1000;
                    break;
                case "mile":
                    targetNum = sourceNum / (float) 1.6;
                    break;
                default:
                    System.out.println("");
                    
            }

        case "kg":
            switch (targetMetric) {
                case "g":
                    targetNum = sourceNum * 1000;
               
            
            }
        case "cm":
            switch (targetMetric) {
                case "m":
                targetNum = sourceNum * (float) 0.01;

            }
            
            break;
        default:
            System.out.println("Your input is not handled");
            return targetNum;
            

    }
    System.out.printf("%.2f %s = %.2f %s%n", sourceNum, sourceMetric, targetNum, targetMetric);
    return targetNum;
  }


  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    String str;
    String[] strs;
    float sourceNum;
    String sourceMetric;
    String targetMetric;
    while (true) {
      System.out.println("Please input the metrics to convert. For example: 1 kg = g");
      str = scanner.nextLine();
      strs = str.split(" ");
      if (str.equals("exit")){
        break;
      }
      if (strs.length < 3 || strs.length > 4) {
        System.out.printf("Your input is %s, which is not handled%nPlease try again", str);
        continue;
      } else if (strs.length == 3) {
        sourceNum = Float.parseFloat(strs[0]);
        sourceMetric = strs[1];
        targetMetric = strs[2];
      } else {
        sourceNum = Float.parseFloat(strs[0]);
        sourceMetric = strs[1];
        targetMetric = strs[3];
      }
      MetricConverter.converter(sourceNum, sourceMetric, targetMetric);
    }
    scanner.close();
  }
}
