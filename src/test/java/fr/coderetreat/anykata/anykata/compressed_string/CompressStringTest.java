package fr.coderetreat.anykata.anykata.compressed_string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompressStringTest {

    @Test
    public void should_compress_string() {
        CompressString compressString = new CompressString();
        String expected = "a2b1c5a3";
        String result = compressString.compress("aabcccccaaa");

        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void should_compress_string_2() {
        CompressString compressString = new CompressString();
        String expected = "a1";
        String result = compressString.compress("a");

        Assertions.assertThat(result).isEqualTo(expected);
    }
}

