package co.rsk.peg.btcLockSender;

import co.rsk.peg.btcLockSender.BtcLockSender.TxSenderAddressType;
import java.util.HashMap;
import java.util.Map;

/*
 * Raw transactions sent from different addresses type
 * Used for testin BtLockSender implementations
 */
public final class RawTransactions {

    // Prevents instantiation
    private RawTransactions() {
    }

    public final static Map<TxSenderAddressType, String> txs;

    static {
        txs = new HashMap<>();
        txs.put(TxSenderAddressType.P2PKH, "0200000001ba47c93a9c8bac4a305ca5e0f8a9a81d1972e06c20fdb0f62ac9960bd48529eb000000006a47304402207ce2c6749019d78c9e7a39a82a08b36956fd05edbb8e820eef5946dc6008c5d00220024a1b6261a8afd9ad8c8888d5fb8f9bc75bc273100abaa68dac225fadcf2c82012103efa4762ccc1358b72f597d002b7fd1cd58cd05db34fe9fa63e43634acf200927ffffffff0200c2eb0b000000001976a914c4f8ff441f41bcc771519dc5ceb9e5a1ee058f7b88ac6cb0eb0b000000001976a9146a6ba0b567d75a449d158fe2d3dacc53f58b246688ac00000000");
        txs.put(TxSenderAddressType.P2SHP2WPKH, "020000000001019eeb37cb9a98c16b4763ebf169e4b76098a76640b7350d7f7d7ace01dcbe3e3700000000171600142ecf5759fdc75cc431b3909733fe012abb262a4bffffffff02b8b4eb0b000000001976a914e8ba7dd0b26eeef0e60a7bb769663f5f2ab02e1488ac00c2eb0b000000001976a914c4f8ff441f41bcc771519dc5ceb9e5a1ee058f7b88ac0247304402204f525ade57004a779c00e4adac76a95d70fd8149307d8e27811a9c097316179502200e87d0edb29d03e3412e2c6ed7af7aa11d60d20a100c1639a6441eb36e70e715012102adeef95a8ffc5d1c4b1a480fd6d68e8b6cf14a65c903b147922150fbfbad91bc00000000");
        txs.put(TxSenderAddressType.P2SHMULTISIG, "0200000001c60b720b35be4e9b171200d2aa9cbc970f7b3dc2578b5fde1849ada72a87f78c00000000fc0047304402207381bbbe3233e80a21bcec8281087e747019797f974df25ae0f6a929bb2e0aea022079a4a573745ab2b77c6dec467605834bab0e84ab9ac5c0611394d954e55653880147304402207aba74b1c303d9f2452069247e1b78102145cad92f8aa8f9a2627ff1b6a5ec990220232ccc1d5ee96f907d23889b201efadb7e38332dfc562163c1ddac92ae759df3014c6952210379e85ce9fe428abaf25783b00fd39490789a5da74c83ba79ee4af734c18e58b22103045c37a5a34ec12b5768dbe05b78d00096304c94c3440fa2381ec669bd176d7321030e7f5032122058b4db9261312b29834c16cdbb2a4960bd0c3d7e7520dc69968253aeffffffff0200a3e1110000000017a91476f03c7004d5e90ffbf6f444bd7984f7e367c5c2872c86e111000000001976a9144c854e2ff0a1af065f32d23c448c704618a6e3ce88ac00000000");
        txs.put(TxSenderAddressType.P2SHP2WSH, "02000000000101ac9f20693aa6f845f36b803ca33ce662729b6ae95aa809bd8c1ac199dd9a5c34010000002322002025eff442e52f7f732446d510ef9e81df10398c55de989094608cff5bdc3eba74ffffffff0200a3e1110000000017a91402d2cf3573d745cb63dd3ec4ca7302ec52144306872092e111000000001976a914b5ea32cdce4c5f642c960c8f9fe07af0d1fa098888ac0400473044022041aad9316ab82721132753f7b9de33c4ceb1b3d05108ecd8426e3c46dbbab0b80220231041a58c37401105fe0018b37f72c771ced10185232e16b307b9fa9fc9d5e10147304402200c9636462cb4afcffbb7d2a31183afd57b48b58b11aeb425e2b902fafa786514022035781873c3c89bf1b6f9a928554059a86e59b51878612f2e9f89e20a6c3da54501695221036a743d486f700d9dcde2190b0639cc7ea4c1893c2a5f123fc79a84f327d53122210377dd4bff81b414195b36a33a6a25cf15a50f55fa3d849e676d263999f93e2bdb2102a3201b3f78f20685ae1a193b4a37fe856d673d9d86f4b5835026079b061acc9153ae00000000");
    }
}
