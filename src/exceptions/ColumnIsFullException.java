package exceptions;

@SuppressWarnings("serial")
public class ColumnIsFullException extends ConnectFourException {

  public ColumnIsFullException() {}

  public ColumnIsFullException(String message) {
    super(message);
  }
}
