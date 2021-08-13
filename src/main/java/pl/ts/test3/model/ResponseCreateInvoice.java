package pl.ts.test3.model;

import java.util.HashMap;
import java.util.List;

public class ResponseCreateInvoice {
    private String id;
    private String object;
    private String account_country;
    private String account_name;
    private List<AccountTaxId> account_tax_ids;
    private Integer amount_due;
    private Integer amount_paid;
    private Integer amount_remaining;
    private Integer application_fee_amount;
    private Integer attempt_count;
    private boolean attempted;
    private boolean auto_advance; //TODO dodać Optional - typ?
    private AutomaticTax automatic_tax; //TODO dowiedzieć jaki typ jest zahashowany, prawdopodobnie String? Przyjmuje to jako String.
    private String billing_reason;
    private String charge;
    private String collection_method;
    private Integer created; //TODO sprawdzić co to za typ timestamp - znak czasu lub przyjąć jako string??
    private String currency; //TODO sprawdzić ten trzyliterowy kod - waluty jaki dokładnie typ, czy może być String?
    private String custom_fields; //TODO sprawdzić jaki typ jest zahashowany - array of hashes - prawdopodobnie String? Przyjmuje to jako String.
    private String customer;
    private String customer_address; //TODO dowiedzieć się jaki typ jest zahashowany, prawdopodobnie String. Przyjmuje to jako String.
    private String customer_email;
    private String customer_name;
    private String customer_phone;
    private String customer_shipping; //TODO dowiedzieć się jaki typ jest zahashowany, przyjmuje to jako String?
    private String customer_tax_exempt;
    private List<CustomerTaxId> customer_tax_ids; //TODO sprawdzić co to za tablica hashu - czy może być String? bo tu mamy pustą tablicę ale pytanie jakiego stypu?
    private String default_payment_method;
    private String default_source;
    private List<DefaultTaxRate> default_tax_rates; //TODO srawdzić co to za tablica hashu - czy może być String bo tu podobnie mamy pustą tablicę ale pytanie jakiego typu?
    private String description;
    private String discount;
    private List<Discount> discounts; //TODO tablica zwiejąca optional array of hashes - sprawdzić jaki typ, czy może być String?
    private String due_date; //TODO sprawdzić co to za typ optional - lub przyjąć jako String?
    private Integer ending_balance;
    private String footer; //TODO sorawdzić co to za typ optional - lub czy przyjąć jako String?
    private String hosted_invoice_url;
    private String invoice_pdf;
    private String last_finalization_error; //TODO sprawdzić co to za typ hash - czy może być String?
    private Lines lines; //TODO sprawdzić co to za typ?
    private boolean livemode;
    private HashMap<String, String> metadata; //TODO sprawdzić co to ma być dokłądnie za typ czy HASHMAPA - para klucz wartość? Czy noy typ Metadata?
    private Integer next_payment_attempt; //TODO sprawdzić co to za tym timestamp, przypisałem Integer, ale może lepiej przyjąć jako String?
    private String number;
    private String on_behalf_of; //TODO sprawdzić co to za typ optional? Czy może być String?
    private boolean paid;
    private String payment_intent;
    private PaymentSettings payment_settings; //TODO sprawdzić co to za typ optional dictionary?? lub hash?
    private Integer period_end; //TODO sprawdzić co to za typ timestamp?
    private Integer period_start; //TODO sprawdzić co to za typ timestamp?
    private Integer post_payment_credit_notes_amount;
    private Integer pre_payment_credit_notes_amount;
    private String quote;
    private String receipt_number;
    private Integer starting_balance;
    private String statement_descriptor; //TODO sprawdzić co to za typ optional? Czy może być String?
    private String status;
    private StatusTransistion status_transitions; //TODO sprawdzić co to za typ? hash - czy moze być String??
    private String subscription; //TODO sprawdzić co to za typ optional? czy może być String?
    private Integer subtotal;
    private Integer tax;
    private Integer total;
    private List<TotalDiscountAmount> total_discount_amounts; //TODO sprawdzić jaki to będzie typ tablica hashu - array of hashes?
    private List<TotalTaxAmount> total_tax_amounts; //TODO sprawdzić jaki to będzie typ tablica hashu - array of hashes?
    private String transfer_data; //TODO sprawdzić co to za typ? Puki co String.
    private Integer webhooks_delivered_at; //TODO sprawdzić co to za typ timestamp?
}
