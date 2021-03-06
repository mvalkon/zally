package de.zalando.zally.integration.zally

enum class ViolationType(private val metricIdentifier: String) {

    MUST("must"),
    SHOULD("should"),
    MAY("may"),
    HINT("hint"),

    /*
     * @deprecated Use MAY instead
     */
    @Deprecated("")
    COULD("could")
}
