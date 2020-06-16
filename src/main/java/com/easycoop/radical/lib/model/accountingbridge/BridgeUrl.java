/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easycoop.radical.lib.model.accountingbridge;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author akinw
 */
@Getter
@Setter
public class BridgeUrl {
    private String bridgeIp;
    private String bridgePort;
    private String authenticationBaseUrlPath;
    private String contributionBaseUrlPath;
    private String loanBaseUrlPath;
    private String equityBaseUrlPath;
    private String targetSavingsBaseUrlPath;
    private String bankBaseUrlPath;
}
