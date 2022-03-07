FROM openjdk:11
RUN mkdir /midterm
COPY src/ /midterm
WORKDIR /midterm
CMD java Main