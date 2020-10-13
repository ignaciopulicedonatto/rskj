package co.rsk.peg.fastbridge;

public class FastBridgeFederationInformation {
    private byte[] fastBridgeFederationScriptHash;
    private byte[] federationScriptHash;

    public FastBridgeFederationInformation(byte[] fastBridgeFederationP2SH, byte[] federationP2SH) {
        this.fastBridgeFederationScriptHash = fastBridgeFederationP2SH.clone();
        this.federationScriptHash = federationP2SH.clone();
    }

    public byte[] getFastBridgeFederationScriptHash() {
        return fastBridgeFederationScriptHash.clone();
    }

    public byte[] getFederationScriptHash() {
        return federationScriptHash.clone();
    }
}
