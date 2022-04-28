package com.kmc.streams;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Produced;

import java.util.Properties;

public class LowerToUpper
{
    public static void main(String[] args)
    {
        Properties properties=new Properties();

        properties.setProperty(StreamsConfig.APPLICATION_ID_CONFIG,"Streams");
        properties.setProperty(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        properties.setProperty(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serde.class.getName());
        properties.setProperty(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG,Serde.class.getName());

        StreamsBuilder streamsBuilder=new StreamsBuilder();

        KStream<String,String> input=streamsBuilder.stream("customerFeedBack");
        KStream<String, String> output=input.mapValues(value ->value.toUpperCase() );
        output.to("outputtopic",Produced.with(Serdes.String(),Serdes.String()));
        KafkaStreams kafkaStreams=new KafkaStreams(streamsBuilder.build(), properties);
        kafkaStreams.start();
        Runtime.getRuntime().addShutdownHook(new Thread(kafkaStreams::close));
    }
}
