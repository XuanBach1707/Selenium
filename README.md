Selenium Login Test - README
Mã Số Sinh Viên: BIT220021
Họ Tên: Hà Xuân Bách

Giới Thiệu Dự Án
Dự án này là một bài kiểm tra tự động hóa cơ bản, thực hiện thao tác đăng nhập trên một trang web mẫu bằng Selenium WebDriver với trình duyệt Microsoft Edge.
Nó bao gồm hai kịch bản:
đăng nhập thành công và đăng nhập thất bại.
Kết quả của mỗi kịch bản được xác minh dựa trên nội dung của các phần tử HTML trên trang.

Mục Tiêu
Tạo trang web mẫu với biểu mẫu đăng nhập:

Trang web chứa hai trường nhập liệu: Tên đăng nhập và Mật khẩu.
Kèm theo một nút để thực hiện đăng nhập.
Kiểm tra chức năng đăng nhập với Selenium WebDriver:

Tự động nhập dữ liệu vào biểu mẫu đăng nhập.
Nhấn nút đăng nhập và xác nhận kết quả trả về từ hệ thống.
Xác minh các kịch bản:

Đăng nhập thành công với thông tin đúng.
Đăng nhập thất bại với thông tin sai.

Mục Đích
Làm quen với Selenium WebDriver:
Tìm hiểu cách tự động hóa kiểm thử giao diện người dùng cho một ứng dụng web.
Tự động hóa kiểm tra giao diện người dùng:
Giảm thời gian kiểm tra thủ công và tăng hiệu quả kiểm thử.
Đảm bảo tính chính xác của chức năng đăng nhập:
Kiểm tra tính ổn định của hệ thống trong các trường hợp người dùng thực tế.

Cấu Trúc Dự Án
index.html: Trang web mẫu chứa biểu mẫu đăng nhập.
LoginTest.java: File Java chứa mã sử dụng Selenium WebDriver để thực hiện kiểm tra tự động hóa.

Hướng Dẫn Cài Đặt và Chạy Kiểm Tra Selenium
Cấu hình môi trường:
Tạo thư mục mới trong dự án Java và thêm Selenium WebDriver vào dependency (dùng Maven hoặc Gradle).
Chuẩn bị trang web mẫu:
Đưa file index.html vào thư mục resources hoặc một vị trí phù hợp trong dự án.
Cấu hình driver:
Đảm bảo đường dẫn đến file msedgedriver.exe chính xác trên máy tính của bạn.
Chạy kiểm tra:
Thực thi file LoginTest.java thông qua IDE như IntelliJ.

Kết Luận
Dự án này là một ví dụ thực tiễn về cách kiểm tra giao diện người dùng đơn giản với Selenium WebDriver,
giúp  làm quen với quy trình tự động hóa kiểm thử.
Có thể mở rộng bài kiểm tra để kiểm tra các chức năng khác như đăng xuất hoặc các thao tác phức tạp hơn.
