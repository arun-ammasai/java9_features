module testModule {
	exports com.java9.features.factorymethod;
	exports com.java9.features.repo;
	exports com.java9.features.safevarargs;
	exports com.java9.features.tryresoucre;
	exports com.java9.features.http2;
	exports com.java9.features.process;
	exports com.java9.features.diamondOperator;
	exports com.java9.features.privatemethod;
	exports com.java9;
	exports com.java9.features.stream;
	requires jdk.incubator.httpclient;
	requires java.desktop;
}