FROM python:3.9-slim

WORKDIR /app
COPY requirements.txt .
COPY factorial.py .
COPY test_factorial.py .

RUN pip install -r requirements.txt

CMD ["python", "factorial.py", "5"]