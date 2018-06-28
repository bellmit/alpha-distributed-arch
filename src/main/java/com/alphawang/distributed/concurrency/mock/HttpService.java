package com.alphawang.distributed.concurrency.mock;

import com.google.common.base.Stopwatch;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * Created by Alpha on 1/4/18.
 */
@Slf4j
public class HttpService {

	public String getHttpResult(Stopwatch stopwatch) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("[{}] {}", stopwatch.elapsed(TimeUnit.MILLISECONDS), "[HttpService] delay 2000ms.");
		return "HTTP Result with 2000ms delay";
	}

	public String getHttpResult(Stopwatch stopwatch, Long id) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("[{}] {}", stopwatch.elapsed(TimeUnit.MILLISECONDS), "[HttpService] delay 2000ms. " + id);
		return "HTTP Result with 2000ms delay: " + id;
	}
}