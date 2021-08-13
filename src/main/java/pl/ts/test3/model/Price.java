package pl.ts.test3.model;

import java.util.HashMap;

public class Price {
    private String id;
    private String object;
    private boolean active;
    private String billing_scheme;
    private Integer created; //TODO dowiedzieć się co to za typ timestamp.
    private String currency;
    private boolean livemode;
    private String lookup_key; //TODO dowiedzieć się co to za typ timestamp.
    private HashMap<String, String> metadata; //TODO dopytać jak to traktować, bo z jednej strony to powinien być klucz wartość, a z drugiej w odpowiedzi nie jest oznaczone jako tablica, lub lista. Póki co hash-mapa, ale moze do poprawy?
    private String nickname;
    private String product; //TODO dowiedzieć się co to za typ konkretnie, puki co String.
    private String recurring; //TODO dowiedzieć się co to za typ? Puki co String.
    private String tax_behavior; //TODO dowiedzieć się co to za typ? Puki co String. Ale może lepiej stworzyć jakiegoś ENUMA?
    private String tiers_mode; //TODO dowiedzieć się co to za typ? Puki co String.
    private String transform_quantity; //TODO dowiedzieć sie co to za typ? Puki co String.
    private String type;
    private Integer unit_amount;
    private Double unit_amount_decimal;
}
