package com.Corejava.Test;

public class StudyMaterial {

		final Trainee trainee;
		String materialname;
		String coursename;

		public StudyMaterial(String materialname, String coursename,Trainee trainee) {
			super();
			this.materialname = materialname;
			this.coursename = coursename;
			this.trainee=trainee;
		}
		public void Read() {
			trainee.Training();
			System.out.println("study material for trainee ");
		}

      public static void main(String[] args) {
			Trainee t=new Trainee();
			StudyMaterial sd=new StudyMaterial("core java", "java", t);
			sd.Read();
}

}