package org.sunbird;

/**
 * this is an actor operation class
 * @author anmolgupta
 */
public enum ActorOperations {

    ADD("add"),
    VALIDATE("validate"),
    DOWNLOAD("download"),
    GENERATE("generate"),
    VERIFY("verify"),
    ADD_CERT_ES("add_cert_es"),
    DELETE_CERT_CASSANDRA("delete_cert_cassandra"),
    READ("read"),
    SEARCH("search"),
    SEARCHV2("searchV2"),
    READ_CERT_META_DATA("readCertMetaData"),
    DOWNLOADV2("downloadV2"),
    ADD_CERT_ES_V2("add_cert_es_v2"),
    DELETE_CERT_CASSANDRA_V2("delete_cert_cassandra_v2");

    private String operation;

    ActorOperations(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }
}

