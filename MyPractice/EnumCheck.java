package MyPractice;

public enum EnumCheck {
    SWIFT("Envelope", "urn:swift:xsd:envelope", null),
    BME_V1("BizMsgEnvlp", "urn:iso:std:iso:20022:tech:xsd:nvlp.001.001.01", "env"),
    BME_V2("BizMsgEnvlp", "urn:iso:std:iso:20022:tech:xsd:nvlp.001.001.02", "env"),
    CUSTOM("RequestPayload", null, null);
    
    private final String rootElement;
    
    private final String namespace;
    
    private final String prefix;
    
    EnumCheck(String rootElement, String namespace, String prefix) {
        System.out.println("EnumCheck constructor called");
      this.rootElement = rootElement;
      this.namespace = namespace;
      this.prefix = prefix;
    }
    
    public String rootElement() {
      return this.rootElement;
    }
    
    public String namespace() {
      return this.namespace;
    }
    
    public String prefix() {
      return this.prefix;
    }
    
}
