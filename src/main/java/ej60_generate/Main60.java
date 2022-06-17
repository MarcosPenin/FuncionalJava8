package ej60_generate;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Main60 {
	public static void main(String[] args) {

		IntStream aleatorios = IntStream.generate(() -> {
			return ThreadLocalRandom.current().nextInt(100);

		});

		aleatorios.limit(25).forEach(x -> {
			System.out.println(x);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		});

	}
}
