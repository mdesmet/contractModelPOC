package be.smartsoftware.mongodbtest.ui;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UISingleCountryGrouping implements UICountryGrouping {
    private UICountry country;
    private Boolean useCountryCurrency;
}
