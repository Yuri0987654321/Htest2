public class Filter {
    public static boolean isValid(char symbol) {
        boolean filter = true;
        if (' ' == symbol || ',' == symbol || '.' == symbol || '?' == symbol || '!' == symbol || '<' == symbol || '>' == symbol || '=' == symbol || '-' == symbol || '+' == symbol || '*' == symbol || '%' == symbol || '@' == symbol || '"' == symbol || '/' == symbol) {
            filter = false;
        }
        return filter;

    }
}
