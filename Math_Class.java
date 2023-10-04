package TestNG;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Math_Class {

@Test
public void scenario1()
{
		double db=Math.PI;
		System.out.println(db);
		System.out.println(Math.addExact(56, 78));
		System.out.println(Math.subtractExact(90, 100));
		System.out.println(Math.max(90, 45));
		System.out.println(Math.random());
		
	}
}

