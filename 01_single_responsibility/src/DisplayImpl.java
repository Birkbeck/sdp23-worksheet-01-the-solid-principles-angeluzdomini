import java.util.List;

public class DisplayImpl implements Display {

  @Override
  public void display(List<String> spots) {
    String formattedFirstRow = spots.get(0) + " | " + spots.get(1) + " | " + spots.get(2) + "\n"
        + spots.get(3) + " | " + spots.get(4) + " | " + spots.get(5) + "\n"
        + spots.get(6) + " | " + spots.get(7) + " | " + spots.get(8);
    System.out.print(formattedFirstRow);
  }
}
