public class Stats {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
		print(max(a));
		print(min(a));
		print(mean(a));
		print(median(a));
		print(quartile1(a));
		print(quartile3(a));
		print(mode(a));
		print(standardDeviation(a));
	}

	public static void print(double a) {
		System.out.println(a);
	}

	public static double max(int[] a) {
		double maximum = 0.0;
		for (int i=0; i<a.length; i++) {
			if (maximum < a[i]) {
				maximum = a[i];
			}
		}
		return maximum;
	}

	public static double min(int[] a) {
		double min = a[0];
		for (int i=0; i<a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}

	public static double mean(int[] a) {
		double mean = 0;
		for (int i=0; i<a.length; i++) {
			mean = mean + a[i];
		}
		mean = mean / a.length;

		return mean;
	}

	public static double median(int[] a) {
		double median = 0.0;
		int i = ((a.length / 2) - 1);
		int sum = a[i];
		int sum2 = a[i+1];
		if ((a.length % 2) == 0.0) {
			median = (((sum + sum2) / 2.0));
		} else {
			median = sum2;
		}
		return median;
	}

	public static double quartile1(int[] a) {
		double quartile = 0;
		int i = 0;

		if (a.length % 2 == 0) {
			i = (a.length / 2);
		} else {
			i = (a.length / 2) + 1;
		}

		int length = 0;

		if (i % 2 == 0) {
			length = (i / 2) - 1;
			quartile = (a[length] + a[length + 1]) / 2.0;
		} else {
			length = ((i / 2));
			quartile = a[length];
		}
		return quartile;
	}

	public static double quartile3(int[] a) {
		double quartile3 = 0;
		int i = 0;

		if (a.length % 2 == 0) {
			i = (a.length / 2);
		} else {
			i = (a.length / 2) + 1;
		}

		int length = a.length;

		if (i % 2 == 0) {
			length = ((i / 2) + (a.length)) / 2;
			quartile3 = (a[length] + a[length+1]) / 2.0;
		} else {
			length = i / 2;
			System.out.println(length);
			quartile3 = (a[length] * 2) + 1;
		}
		return quartile3;
	}

	public static int mode(int[] a) {
		int mode = 0;
		for (int i=0; i<a.length - 1; i++) {
			if (a[i] == a[i+1]) {
				mode = a[i];
			}
		}
		return mode;
	}

	public static double standardDeviation(int[] a) {
		double sum = 0.0;
		double mean = mean(a);
		for (int i=0; i<a.length; i++) {
			sum += Math.pow(mean - a[i], 2);
		}
		sum = (sum / (a.length - 1));
		sum = Math.sqrt(sum);
		return sum;
	}
}