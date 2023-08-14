package innerclass.classinsideinterface;

public interface EmailService {
    public void sendEmail(EmailDetail e);
    class EmailDetail{
        private String from;
        private String to;
        private String cc;
        private String bc;
        private String subject;
        private String body;

        public EmailDetail() {
        }

        public EmailDetail(String from, String to, String cc,
                           String bc, String subject, String body) {
            this.from = from;
            this.to = to;
            this.cc = cc;
            this.bc = bc;
            this.subject = subject;
            this.body = body;
        }

        public String getFrom() {
            return from;
        }

        public String getTo() {
            return to;
        }

        public String getCc() {
            return cc;
        }

        public String getBc() {
            return bc;
        }

        public String getSubject() {
            return subject;
        }

        public String getBody() {
            return body;
        }

        @Override
        public String toString() {
            return "EmailDetail{" +
                    "from='" + from + '\'' +
                    ", to='" + to + '\'' +
                    ", cc='" + cc + '\'' +
                    ", bc='" + bc + '\'' +
                    ", subject='" + subject + '\'' +
                    ", body='" + body + '\'' +
                    '}';
        }
    }
}
