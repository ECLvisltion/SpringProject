package com.wizlive.wizserve;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.iv.RandomIvGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WizserveApplicationTests
{
  @Test
  void testJpa()
  {
    Boolean b = true;
    
    assertTrue(b);
  }

  @Test
	void stringEncryptor() {
		String url = "db_url"; 
		String username = "db_username";

    assertNotEquals(jasyptEncoding(url), jasyptEncoding(username));
	}

	private String jasyptEncoding(String value)
  {
		String key = "my_jasypt_key";
		StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
		pbeEnc.setAlgorithm("PBEWITHHMACSHA512ANDAES_256");
		pbeEnc.setPassword(key);
		pbeEnc.setIvGenerator(new RandomIvGenerator());
		return pbeEnc.encrypt(value);
	}
}
