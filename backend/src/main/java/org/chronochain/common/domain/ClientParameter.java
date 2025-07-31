package org.chronochain.common.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientParameter {

    private String apiKey;

    private String secretKey;

    private String passphrase;

    private String baseUrl;

    private Long timeout;

    private String locale;
}
