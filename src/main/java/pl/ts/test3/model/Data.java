package pl.ts.test3.model;

import java.util.HashMap;
import java.util.List;

public class Data {
    private String id;
    private String object;
    private Integer amount;
    private String currency;
    private String description;
    private List<DiscountAmount> discount_amounts; //TODO dowiedzieć się co to za tablica? Jaki typ został zahashowany?
    private boolean discountable;
    private List<Discount> discounts;
    private String invoice_item;
    private boolean livemode;
    private HashMap<String, String> metadata; //TODO dopytać jak to traktować, bo z jednej strony to powinien być klucz wartość, a z drugiej w odpowiedzi nie jest oznaczone jako tablica, lub lista. Póki co hash-mapa, ale moze do poprawy?
    private Period period;
    private Price price;
    private boolean proration;
    private Integer quantity;
    private String subscription;
    private List<String> tax_amounts; //TODO dopytać o ten typ?
    private List<String> tax_rates; //TODO dopytać o typ?
    private String type;
}
